import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'jhi-main-menu',
    templateUrl: './main-menu.component.html',
    styleUrls: ['main-menu.css']
})
export class MainMenuComponent implements OnInit {
    constructor(private router: Router) {}

    ngOnInit() {}
}
