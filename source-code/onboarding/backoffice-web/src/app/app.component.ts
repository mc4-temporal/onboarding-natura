import {DOCUMENT} from '@angular/common';
import {Component, Inject, OnInit, Renderer2} from '@angular/core';
import {MatIconRegistry} from '@angular/material/icon';
import {SidenavService} from './layout/sidenav/sidenav.service';
import {Theme, ThemeService} from '../@mc4/services/theme.service';
import {ActivatedRoute} from '@angular/router';
import {Platform} from '@angular/cdk/platform';
import {SplashScreenService} from '../@mc4/services/splash-screen.service';
import {AuthService} from './commons/services/security/auth.service';
import {SecureStorageService} from '../@mc4/services/secure-storage.service';
import {KeyStorage} from './commons/utils/key-storage.util';

@Component({
  selector: 'mc4-root',
  templateUrl: './app.component.html'
})
export class AppComponent implements OnInit {

  constructor(private sidenavService: SidenavService,
              private iconRegistry: MatIconRegistry,
              private renderer: Renderer2,
              private themeService: ThemeService,
              @Inject(DOCUMENT) private document: Document,
              private platform: Platform,
              private authService: AuthService,
              private storage: SecureStorageService,
              private route: ActivatedRoute,
              private splashScreenService: SplashScreenService) {
    // this.route.queryParamMap.pipe(
    //   filter(queryParamMap => queryParamMap.has('style'))
    // ).subscribe(queryParamMap => this.themeService.setStyle(queryParamMap.get('style')));
    this.iconRegistry.setDefaultFontSetClass('material-icons');
    this.themeService.theme$.subscribe(theme => {
      if (theme[0]) {
        this.renderer.removeClass(this.document.body, theme[0]);
      }

      this.renderer.addClass(this.document.body, theme[1]);
    });

    if (this.platform.BLINK) {
      this.renderer.addClass(this.document.body, 'is-blink');
    }
  }

  async ngOnInit() {
    const lastTheme: Theme = this.storage.getStorage(KeyStorage.themeKey.lastTheme);
    if (this.authService.isLoggedIn()) {
      await this.themeService.recoveryAppTheme();
    } else if (lastTheme) {
      this.themeService.setTheme(lastTheme);
    } else this.themeService.setTheme('mc4-default');
  }
}
