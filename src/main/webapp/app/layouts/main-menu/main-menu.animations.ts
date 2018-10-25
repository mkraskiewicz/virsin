import { trigger, state, style, transition, group, animate, query } from '@angular/animations';

export const buttonStateTrigger = trigger('buttonState', [
    state(
        'valid',
        style({
            color: 'lightgreen'
        })
    ),
    state(
        'invalid',
        style({
            color: 'white'
        })
    ),
    transition('invalid <=> valid', [
        group([
            animate(
                100,
                style({
                    content: '../../../content/images/clicked.png'
                })
            )
        ])
    ])
]);
