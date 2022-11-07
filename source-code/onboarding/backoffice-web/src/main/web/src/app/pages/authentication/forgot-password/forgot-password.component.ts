import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { fadeInUpAnimation } from '../../../../@mc4/animations/fade-in-up.animation';

@Component({
  selector: 'mc4-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.scss'],
  animations: [fadeInUpAnimation]
})
export class ForgotPasswordComponent implements OnInit {

  form = this.fb.group({
    email: [null, Validators.required]
  });

  constructor(
    private router: Router,
    private fb: FormBuilder
  ) { }

  ngOnInit() {
  }

  send() {
    this.router.navigate(['/']);
  }
}
