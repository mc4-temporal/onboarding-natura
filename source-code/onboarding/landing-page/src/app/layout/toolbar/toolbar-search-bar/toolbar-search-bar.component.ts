import { Component, OnInit } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { SidenavItem } from '../../sidenav/sidenav-item/sidenav-item.interface';
import { SidenavService } from '../../sidenav/sidenav.service';

@Component({
  selector: 'mc4-toolbar-search-bar',
  templateUrl: './toolbar-search-bar.component.html',
  styleUrls: ['./toolbar-search-bar.component.scss']
})
export class ToolbarSearchBarComponent implements OnInit {

  input: string;
  focused: boolean;

  recentlyVisited: SidenavItem[] = [ ];
  allItems: SidenavItem[] = [];
  filteredItems: SidenavItem[] = [];

  constructor(
    private router: Router,
    private sidenavService: SidenavService
  ) { }

  ngOnInit() {
    this.sidenavService.items$.subscribe(res => {
      for (const parent of this.sidenavService.items) {
        for (const item of parent.subItems) {
          if (this.allItems.findIndex(itt => itt.route === item.route) === -1) {
            this.allItems.push(item);
          }
        }
      }
    });
    this.router.events.subscribe((event) => {
      if (event instanceof NavigationEnd) {
        let item = null;
        for (const parent of this.sidenavService.items) {
          item = parent.subItems.find(iit => `/${iit.route}` === event.urlAfterRedirects);
          if (item) {
            break;
          }
        }
        if (item) {
          const index = this.recentlyVisited.indexOf(item);
          if (index > -1) {
            this.recentlyVisited.splice(index, 1);
          }

          this.recentlyVisited.unshift(item);

          if (this.recentlyVisited.length > 5) {
            this.recentlyVisited.pop();
          }
        }
      }

    });
  }

  openDropdown() {
    this.focused = true;
  }

  closeDropdown() {
    this.focused = false;
  }

  filterItems(search: string) {
    this.filteredItems = this.allItems.filter(item => item.name.toLowerCase().indexOf(search) >= 0);
  }

}
