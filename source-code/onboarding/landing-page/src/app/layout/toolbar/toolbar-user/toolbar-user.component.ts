import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {IUser} from '../../../commons/model/security.interface';
import {Router} from '@angular/router';


@Component({
  selector: 'mc4-toolbar-user',
  templateUrl: './toolbar-user.component.html',
  styleUrls: ['./toolbar-user.component.scss']
})
export class ToolbarUserComponent implements OnInit {
  @Output() configPanel = new EventEmitter();
  isOpen: boolean;
  userInfo: IUser;
  constructor(private router: Router) { }

  ngOnInit() {
    this.userInfo = {} as IUser;
    // if (this.authService.isLoggedIn()) {
    //   this.userInfo = this.authService.getUserInfo();
    //   this.userInfo.initials = this.userInfo.name[0];
    //   if (this.userInfo.lastname && this.userInfo.lastname.length > 1) {
    //     this.userInfo.initials += this.userInfo.lastname[0];
    //   }
    // }
  }

  toggleDropdown() {
    this.isOpen = !this.isOpen;
  }

  onClickOutside() {
    this.isOpen = false;
  }

  async cerrarSesion() {
    // await this.authService.requestLogoutUser().toPromise();
    // this.authService.requestLogout();
    window.location.reload();
  }

  async toProfile() {
    await this.router.navigate(['/security/profile']);
  }
}
