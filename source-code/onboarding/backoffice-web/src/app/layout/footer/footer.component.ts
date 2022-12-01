import { Component, OnDestroy, OnInit } from '@angular/core';
import { ThemeService } from '../../../@mc4/services/theme.service';
import { map } from 'rxjs/operators';
import * as moment from 'moment';
import {HttpClient} from '@angular/common/http';
import {UserService} from '../../commons/services/security/user.service';

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
              private userService: UserService) {
  }

  ngOnInit() {
    this.year = moment().year();
    this.userService.requestVersion()
      .subscribe({next: version => this.version = version});
  }

  hide() {
    this.themeService.setFooterVisible(false);
  }

  ngOnDestroy(): void {}
}
