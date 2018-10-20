import { Component, OnInit, Optional } from '@angular/core';
import { PlayerService } from 'app/entities/player';
import { Player } from 'app/shared/model/player.model';
import { AccountService, LoginModalService, LoginService, Principal, User } from 'app/core';

import { ProfileService } from 'app/layouts';

@Component({
    selector: 'jhi-character-sheet',
    templateUrl: './character-sheet.component.html',
    styles: [],
    styleUrls: ['character-sheet.css']
})
export class CharacterSheetComponent implements OnInit {
    public values;
    player: Player;
    name: string;
    constructor(private playerService: PlayerService) {}

    ngOnInit() {
        this.playerService.findCurrent().subscribe(data => {
            this.player = data.body;
            this.name = this.player.user.login;
            console.log(this.player);
            console.log(this.name);
        });
    }
}
