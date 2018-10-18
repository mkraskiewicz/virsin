import { NgModule } from '@angular/core';

import { VirsinSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [VirsinSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [VirsinSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class VirsinSharedCommonModule {}
