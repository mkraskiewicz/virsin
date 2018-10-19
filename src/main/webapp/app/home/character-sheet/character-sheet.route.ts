import { Route } from '@angular/router';

import { CharacterSheetComponent } from './character-sheet.component';

export const characterSheetRoute: Route = {
    path: 'character',
    component: CharacterSheetComponent,
    data: {
        authorities: [],
        pageTitle: 'Welcome, Java Hipster!'
    }
};
