import { AfterViewInit, ChangeDetectorRef, Component, ElementRef, Inject, OnInit, ViewChild } from '@angular/core';
import { SidenavService } from '../sidenav/sidenav.service';
import { SidenavItem } from '../sidenav/sidenav-item/sidenav-item.interface';
import { Router } from '@angular/router';
import { DOCUMENT } from '@angular/common';

@Component({
  selector: 'mc4-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnInit, AfterViewInit {

  sidenavItems$ = this.sidenavService.items$;
  currentlyOpen$ = this.sidenavService.currentlyOpen$;
  showMoreButtonAfterIndex = 8;

  @ViewChild('overflowContainer') overflowContainer: ElementRef;

  constructor(private sidenavService: SidenavService,
              @Inject(DOCUMENT) private document: Document,
              private cd: ChangeDetectorRef,
              private router: Router) {}

  ngOnInit() {}

  handleClick(item: SidenavItem) {
    if (item.subItems && item.subItems.length > 0) {
      this.sidenavService.toggleItemOpen(item);
    } else if (typeof item.route === 'string' || item.route instanceof String) {
      this.router.navigate([item.route]);
    } else if (typeof item.route === 'function' || item.route instanceof Function) {
      item.route();
    } else {
      throw Error('Could not determine what to do, Sidenav-Item has no routeOrFunction set AND does not contain any subItems');
    }
  }

  ngAfterViewInit(): void {
  }
}
