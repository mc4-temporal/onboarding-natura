package bo.com.mc4.onboarding.backoffice;


import bo.com.mc4.onboarding.core.util.ProfileContants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collection;
import java.util.TimeZone;


@EnableJpaRepositories(basePackages = {"bo.com.mc4.onboarding.repository"})
@EntityScan(basePackages = {"bo.com.mc4.onboarding.model"})
@ComponentScan(basePackages = {"bo.com.mc4.onboarding","bo.com.mc4.onboarding.backoffice.jwt"})
@SpringBootApplication(scanBasePackages={"bo.com.mc4.onboarding", "bo.com.mc4.onboarding.core.service"})
@EnableAsync
@EnableWebSecurity
@Slf4j
public class BackofficeApplication implements CommandLineRunner{

	private final Environment env;

	public BackofficeApplication(Environment env) {
		this.env = env;
	}
	@PostConstruct
	public void initApplication() {
		Collection<String> activeProfiles = Arrays.asList(env.getActiveProfiles());
		if (activeProfiles.contains(ProfileContants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(ProfileContants.SPRING_PROFILE_PRODUCTION)) {
			log.error("You have misconfigured your application! It should not run " +
					"with both the 'dev' and 'prod' profiles at the same time.");
		}
		if (activeProfiles.contains(ProfileContants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(ProfileContants.SPRING_PROFILE_CLOUD)) {
			log.error("You have misconfigured your application! It should not " +
					"run with both the 'dev' and 'cloud' profiles at the same time.");
		}
	}

	public static void main(String[] args) {
		TimeZone.getTimeZone(ZoneId.of("America/La_Paz"));
		Environment env  = SpringApplication.run(BackofficeApplication.class, args).getEnvironment();
		SpringApplication app = new SpringApplication(BackofficeApplication.class);
		//DefaultProfileUtil.addDefaultProfile();
		//Environment env = app.run(args).getEnvironment();
		logApplicationStartup(env);
	}

	@Override
	public void run(String... args) throws Exception {
	}

	private static void logApplicationStartup(Environment env) {

		String protocol = "http";
		if (env.getProperty("server.ssl.key-store") != null) {
			protocol = "https";
		}
		String serverPort = env.getProperty("server.port");
		String contextPath = env.getProperty("server.servlet.context-path");
		if (StringUtils.isBlank(contextPath)) {
			contextPath = "/";
		}
		String hostAddress = "localhost";
		try {
			hostAddress = InetAddress.getLocalHost().getHostAddress();
			log.info("addres: {}", hostAddress);
		} catch (UnknownHostException e) {
			log.warn("The host name could not be determined, using `localhost` as fallback");
		}
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\t{}://localhost:{}{}\n\t" +
						"External: \t{}://{}:{}{}\n\t" +
						"Profile(s): \t{}\n----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				protocol,
				serverPort,
				contextPath,
				protocol,
				hostAddress,
				serverPort,
				contextPath,
				env.getActiveProfiles());

	}



}
