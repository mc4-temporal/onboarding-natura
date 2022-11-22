// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `angular-cli.json`.

export const environment = {
  production: false,
  googleMapsApiKey: '',
  storageSecretKey: 'secret-for-storage',
  api: 'http://localhost:8081',
  apiClient: 'http://localhost:8081',
  appLogProccess: 'APLICACION_WEB',
  backend: {
    onboardingApi: '/api/onboarding',
    logApi: '/api/v1/log',

    apiLogin: '/auth/signin',
    apiLogout: '/auth/logout',
    apiChangePass: '/auth/cambiar-password',
    apiRecursos: '/api/resource',
    userApi: '/api/v1/user',
    participanteApi: '/api/participant',
    certificadoApi: '/api/certificate',
    mensajeApi: '/api/message',
    ordenApi: '/api/order',
    businessApi: '/api/business'
  },
  backendV2: {
    userApi: '/api/v1/user',
    roleApi: '/api/v1/role',
    domainApi: '/api/v1/domain',
    actionApi: '/api/v1/action',
    themeApi: '/api/v1/theme',
    resourceApi: '/api/v1/resource',
    parameterApi: '/api/v1/parameter',
    parameterGroupApi: '/api/v1/parameter-group',
    utilApi: '/api/v1/utils',
  }
};
