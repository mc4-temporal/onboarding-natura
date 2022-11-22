import { Component, OnDestroy, OnInit } from '@angular/core';
import { ThemeService } from '../../../@mc4/services/theme.service';
import { map } from 'rxjs/operators';
import * as moment from 'moment';
import {LandingService} from '../../commons/services/landing.service';

@Component({
  selector: 'mc4-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent implements OnInit, OnDestroy {

  visible$ = this.themeService.config$.pipe(map(config => config.footerVisible));
  version = '';
  year;
  constructor(private themeService: ThemeService,
              private landingService: LandingService) {
  }

  ngOnInit() {
    this.year = moment().year();
    this.landingService.requestVersion()
      .subscribe({next: version => this.version = version});
  }

  hide() {
    this.themeService.setFooterVisible(false);
  }

  ngOnDestroy(): void {}
}
