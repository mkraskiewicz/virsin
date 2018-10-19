import { Route } from '@angular/router';

import { HomeComponent } from './';

import { characterSheetRoute } from 'app/home/character-sheet/character-sheet.route';

const characterRoutes = [characterSheetRoute];
export const HOME_ROUTE: Route = {
    path: '',
    component: HomeComponent,
    data: {
        authorities: [],
        pageTitle: 'Welcome, Java Hipster!',
        children: [
            {
                path: 'character',
                loadChildren: './character-sheet/character-sheet.module#CharacterSheetModule'
            }
        ]
    }
};
