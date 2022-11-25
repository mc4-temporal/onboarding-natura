import {Directive, ElementRef, HostListener, Input, OnInit} from '@angular/core';

@Directive({
  selector: '[mc4Restrictions]'
})
export class RestrictionDirective implements OnInit {
  @Input('mc4Restrictions') type: RestrictionType;

  private restrictions = {
    letters: /[a-zA-Z ]/,
    numbers: /[0-9]/,
    alphaNumeric: /[a-zA-Z0-9_ ]/
  };

  constructor(private elementRef: ElementRef) {}

  ngOnInit() {
  }

  @HostListener('keypress', ['$event']) onKeyPress(event) {
    switch (this.type) {
      case 'numbers':
        if (!new RegExp(this.restrictions.numbers).test(event.key)) {
          event.preventDefault();
        }
        break;
      case 'letters':
        if (!new RegExp(this.restrictions.letters).test(event.key)) {
          event.preventDefault();
        }
        break;
      case 'alphanumeric':
        if (!new RegExp(this.restrictions.alphaNumeric).test(event.key)) {
          event.preventDefault();
        }
        break;
      case 'no_spaces':
        if (event.key === ' ') {
          event.preventDefault();
        }
        break;
    }
  }
}

export type RestrictionType = 'numbers' | 'letters' | 'alphanumeric' | 'no_spaces';
