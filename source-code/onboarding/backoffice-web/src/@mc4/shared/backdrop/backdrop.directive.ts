import { Directive, EventEmitter, HostBinding, HostListener, Input, Output } from '@angular/core';

@Directive({
  selector: '[mc4Backdrop],mc4-backdrop',
  host: {
    class: 'mc4-backdrop'
  },
  exportAs: 'mc4Backdrop'
})
export class BackdropDirective {

  @Input()
  @HostBinding('class.visible')
  visible: boolean;

  @HostBinding('class.invisible') invisible: boolean;
  @Output() closed = new EventEmitter();

  constructor() {}

  show() {
    if (!this.visible) {
      this.visible = true;
      this.invisible = false;
    }
  }

  @HostListener('click')
  hide() {
    if (this.visible) {
      this.visible = false;
      this.invisible = false;
      this.closed.emit();
    }
  }

  showInvisible() {
    if (!this.visible) {
      this.visible = true;
      this.invisible = true;
    }
  }
}
