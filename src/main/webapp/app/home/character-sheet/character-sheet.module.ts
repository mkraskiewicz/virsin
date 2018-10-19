import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { characterSheetRoute } from 'app/home/character-sheet/character-sheet.route';
import { CharacterSheetComponent } from 'app/home/character-sheet/character-sheet.component';

@NgModule({
    imports: [RouterModule.forRoot([characterSheetRoute], { useHash: true })],
    declarations: [CharacterSheetComponent]
})
export class CharacterSheetModule {}
