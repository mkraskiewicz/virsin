import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { VirsinSharedModule } from 'app/shared';
import { VirsinAdminModule } from 'app/admin/admin.module';
import {
    PlayerComponent,
    PlayerDetailComponent,
    PlayerUpdateComponent,
    PlayerDeletePopupComponent,
    PlayerDeleteDialogComponent,
    playerRoute,
    playerPopupRoute
} from './';

const ENTITY_STATES = [...playerRoute, ...playerPopupRoute];

@NgModule({
    imports: [VirsinSharedModule, VirsinAdminModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [PlayerComponent, PlayerDetailComponent, PlayerUpdateComponent, PlayerDeleteDialogComponent, PlayerDeletePopupComponent],
    entryComponents: [PlayerComponent, PlayerUpdateComponent, PlayerDeleteDialogComponent, PlayerDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class VirsinPlayerModule {}
