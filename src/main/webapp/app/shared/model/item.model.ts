import { IPlayer } from 'app/shared/model//player.model';

export const enum ItemType {
    Weapon = 'Weapon',
    Armor = 'Armor',
    Helmet = 'Helmet',
    Shield = 'Shield',
    Cape = 'Cape',
    Boots = 'Boots',
    Necklace = 'Necklace',
    Ring = 'Ring'
}

export interface IItem {
    id?: number;
    name?: string;
    imageUrl?: string;
    type?: ItemType;
    equipped?: boolean;
    strBonus?: number;
    conBonus?: number;
    dexBonus?: number;
    luckBonus?: number;
    minDmg?: number;
    maxDmg?: number;
    player?: IPlayer;
}

export class Item implements IItem {
    constructor(
        public id?: number,
        public name?: string,
        public imageUrl?: string,
        public type?: ItemType,
        public equipped?: boolean,
        public strBonus?: number,
        public conBonus?: number,
        public dexBonus?: number,
        public luckBonus?: number,
        public minDmg?: number,
        public maxDmg?: number,
        public player?: IPlayer
    ) {
        this.equipped = this.equipped || false;
    }
}
