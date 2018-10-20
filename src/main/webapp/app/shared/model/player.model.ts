import { IUser } from 'app/core/user/user.model';
import { IItem } from 'app/shared/model//item.model';

export interface IPlayer {
    id?: number;
    imageUrl?: string;
    experience?: number;
    level?: number;
    strength?: number;
    condition?: number;
    dexterity?: number;
    luck?: number;
    gold?: number;
    user?: IUser;
    equipment?: IItem[];
}

export class Player implements IPlayer {
    constructor(
        public id?: number,
        public imageUrl?: string,
        public experience?: number,
        public level?: number,
        public strength?: number,
        public condition?: number,
        public dexterity?: number,
        public luck?: number,
        public gold?: number,
        public user?: IUser,
        public equipment?: IItem[]
    ) {}
}
