package com.BartBoys3.theQuestOfTheBreadstick

import jdk.jfr.Percentage

class BattleMoves {

    open inner class Attack(damage: Double,critical: Double,hitRate: Double) {

        open inner class MeleeAttack(damage: Double,critical: Double,hitRate: Double) {
            var headbutt = MeleeAttack(20.00,5.00,95.00)
        }

        open inner class WeaponAttack(damage: Double,critical: Double,hitRate: Double) {

        }

    }

    inner class DefenseMove {

    }

    inner class MagicMove {

        inner class MagicAttack(damage: Double,critical: Double,hitRate: Double) {
            var flames = MagicAttack(15.00,10.00,85.00)
        }

    }

    inner class Item {

    }

}
