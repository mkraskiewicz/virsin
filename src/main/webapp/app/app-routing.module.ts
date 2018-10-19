import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { errorRoute, navbarRoute } from './layouts';
import { DEBUG_INFO_ENABLED } from 'app/app.constants';
import { CharacterSheetComponent } from 'app/home/character-sheet/character-sheet.component';
import { HomeComponent } from 'app/home';

const LAYOUT_ROUTES = [navbarRoute, ...errorRoute];

@NgModule({
    imports: [
        RouterModule.forRoot(
            [
                {
                    path: 'admin',
                    loadChildren: './admin/admin.module#VirsinAdminModule'
                },
                ...LAYOUT_ROUTES,
                {
                    path: 'character',
                    component: CharacterSheetComponent
                },
                {
                    path: 'home',
                    component: HomeComponent
                }
            ],

            { useHash: true, enableTracing: DEBUG_INFO_ENABLED }
        )
    ],
    exports: [RouterModule]
})
export class VirsinAppRoutingModule {}
