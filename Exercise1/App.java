public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        // Exercise 1
        // 1. Create a "Weapon" class.

        // The Weapon class will have the following attributes.

        // Name
        // Damage
        // Weight
        // Rarity
        // Description

        // 2. Create a method named "weaponDescription" that will display the weapon
        // description.

        // 3. Create three (3) objects from the "Weapon" class and give them attributes

        // Examples

        // Object - Hammer
        // Object Name - "Mjollnir"
        // Weight - 4.5
        // Rarity - "Legendary"
        // Description - "A might hammer owned by the god of lightning thor!"

        // Object - Short Sword
        // Object Name - "Common Sword"
        // Weight - 2
        // Rarity - "Common"
        // Description - "A cheap sword used mostly by common enemies"
    }
}
