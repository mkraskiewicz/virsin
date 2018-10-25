import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { buttonStateTrigger } from 'app/layouts/main-menu/main-menu.animations';

@Component({
    selector: 'jhi-main-menu',
    templateUrl: './main-menu.component.html',
    styleUrls: ['main-menu.css'],
    animations: [buttonStateTrigger]
})
export class MainMenuComponent implements OnInit {
    constructor(private router: Router) {}

    state: string = 'invalid';
    ngOnInit() {}

    onClick() {
        if (this.state === 'valid') this.state = 'invalid';
        else this.state = 'valid';
    }
}
