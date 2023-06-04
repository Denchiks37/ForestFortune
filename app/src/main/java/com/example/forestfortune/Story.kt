
package com.example.forestfortune

import android.view.View

class Story(val ga: GameActivity) {

    var nextPosition1 = ""
    var nextPosition2 = ""
    var nextPosition3 = ""
    var nextPosition4 = ""
    var sword = false
    var killedPlant = false
    var strength = 0

    fun selectPosition(position: String) {

        val map = "map"
        when (position) {
            "startingPoint" -> startPoint()
            "Tmap" -> Tmap()
            "pipe" -> pipe()
            "plant" -> plant()
            "monster" -> monster()
            "Attack" -> Attack()
            "swordAltar" -> swordAltar()
            "sword" -> sword()
            "dead" -> dead()
            "goTitleScreen" -> ga.goTitleScreen()
            "weak" -> weak()
            "dungeon" -> dungeon()
            "dolmen" -> dolmen()
            "crypt" -> crypt()
            "cave" -> cave()
            "spider" -> spider()
            "powerSource" -> powerSource()
            "increasePower" -> increasePower()
            "end" -> end()
            "mimic" -> mimic()
            "tryOpen" -> tryOpen()
            "lockedChest" -> lockeChest()
            "deadMimic" -> deadMimic()
            "showGameCredits" -> showGameCredits()
        }
    }

    fun showAllButtons() {
        ga.choice1.setVisibility(View.VISIBLE)
        ga.choice2.setVisibility(View.VISIBLE)
        ga.choice3.setVisibility(View.VISIBLE)
        ga.choice4.setVisibility(View.VISIBLE)
    }

    // Add new location functions here

    fun startPoint() {
        ga.GameImage.setImageResource(R.drawable.crossroad)
        ga.GameText.setText("You are standing at a crossroad. The treasure map in your pocket points in multiple directions. \n\n What will you do?")

        showAllButtons()

        ga.choice1.setText("Go north")
        ga.choice2.setText("Go east")
        ga.choice3.setText("Go west")
        ga.choice4.setText("View map")

        nextPosition1 = "cave"
        nextPosition2 = "swordAltar"
        nextPosition3 = "pipe"
        nextPosition4 = "Tmap"
    }

    fun cave() {
        ga.GameImage.setImageResource(R.drawable.cave)
        ga.GameText.setText("You enter a dark cave. The air is damp, and the path ahead is shrouded in mystery.")

        showAllButtons()

        ga.choice1.setText("Keep exploring the cave")
        ga.choice2.setText("Turn back")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)



        nextPosition1 = "dungeon"
        nextPosition2 = "startingPoint"
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun dungeon() {
        ga.GameImage.setImageResource(R.drawable.dungeongate)
        ga.GameText.setText("You arrive at a mysterious dungeon entrance. It emanates an eerie aura. \n\n What will you do?")

        showAllButtons()

        ga.choice1.setText("Enter the dungeon")
        ga.choice2.setText("Look left")
        ga.choice3.setText("Look right")
        ga.choice4.setText("Go back")



        nextPosition1 = "monster"
        nextPosition2 = "dolmen"
        nextPosition3 = "crypt"
        nextPosition4 = "cave"
    }

    fun crypt() {
        ga.GameImage.setImageResource(R.drawable.crypt)
        ga.GameText.setText("You stumble upon an ancient crypt, its stone door partially ajar. ")

        showAllButtons()

        ga.choice1.setText("Enter the crypt")
        ga.choice2.setText("Go back")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)



        nextPosition1 = "spider"
        nextPosition2 = "dungeon"
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun spider() {
        ga.GameImage.setImageResource(R.drawable.spider)
        ga.GameText.setText("You encounter a giant spider guarding the entrance of the crypt. Its multiple eyes stare at you menacingly.")

        showAllButtons()

        ga.choice1.setText("Attack the spider")
        ga.choice2.setText("Retreat")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "dead"
        nextPosition2 = "dungeon"
        nextPosition3 = ""
        nextPosition4 = ""

    }

    fun dolmen() {
        ga.GameImage.setImageResource(R.drawable.dolmen)
        ga.GameText.setText("You stand in front of an ancient dolmen, surrounded by an aura of mystery.")

        showAllButtons()

        ga.choice1.setText("Approach the dolmen")
        ga.choice2.setText("Go back")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "powerSource"
        nextPosition2 = "dungeon"
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun powerSource() {
        ga.GameImage.setImageResource(R.drawable.powersource)
        ga.GameText.setText("You stumble upon a mystical power source, emanating a radiant energy. This source has the potential to increase your power.")

        showAllButtons()

        ga.choice1.setText("Absorb the power")
        ga.choice2.setText("Go back")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "increasePower"
        nextPosition2 = "dungeon"
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun increasePower() {
        ga.GameImage.setImageResource(R.drawable.strength)
        ga.GameText.setText("As you approach the mystical power source, you can feel its radiant energy permeating your being. You absorb the power, and your strength increases.")

        strength++

        showAllButtons()

        ga.choice1.setText("Go back")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "dungeon"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }


    fun monster() {
        ga.GameImage.setImageResource(R.drawable.monster)
        ga.GameText.setText("As you venture deeper into the forest, you come across a fearsome monster blocking the path. It looks formidable and ready to attack. \n\n What will you do?")

        showAllButtons()

        ga.choice1.setText("Engage in battle")
        ga.choice2.setText("Retreat")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "Attack"
        nextPosition2 = "dungeon"
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun Attack() {
        if (sword && killedPlant) {
            ga.GameImage.setImageResource(R.drawable.swordslice)
            ga.GameText.setText("You muster all your strength and deliver a swift strike of your sword, defeating the monster.")

            nextPosition1 = "lockedChest"
            nextPosition2 = ""
            nextPosition3 = ""
            nextPosition4 = ""
        } else if (sword && !killedPlant) {
            ga.GameImage.setImageResource(R.drawable.swordbreak)
            ga.GameText.setText("You valiantly fight against the monster but succumb to its relentless assault. Your sword shatters under the enemy's might.")

            nextPosition1 = "dead"
            nextPosition2 = ""
            nextPosition3 = ""
            nextPosition4 = ""
        } else {
            ga.GameImage.setImageResource(R.drawable.deadlystrike)
            ga.GameText.setText("You enter the battle unarmed, and the monster swiftly delivers a deadly blow. Your journey comes to an unfortunate end.")

            nextPosition1 = "dead"
            nextPosition2 = ""
            nextPosition3 = ""
            nextPosition4 = ""
        }

        showAllButtons()

        ga.choice1.setText(">")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)
    }

    fun Tmap() {
        ga.GameImage.setImageResource(R.drawable.map)
        ga.GameText.setText("You take a look at the treasure map. It reveals the following clue:\n\nTo find the treasure, go north.")

        showAllButtons()

        ga.choice1.setText("Go back")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "startingPoint"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun pipe() {
        ga.GameImage.setImageResource(R.drawable.pipe)
        ga.GameText.setText("You come across a massive pipe obstructing your path. It seems difficult to traverse around it. \n\n What will you do?")

        showAllButtons()

        ga.choice1.setText("Look inside the pipe")
        ga.choice2.setText("Go back")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "plant"
        nextPosition2 = "startingPoint"
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun plant() {
        ga.GameImage.setImageResource(R.drawable.plant)

        if (!sword) {
            ga.GameText.setText("As you approach the pipe, a vicious piranha plant jumps out and swiftly devours you. Your adventure comes to a tragic end.")

            nextPosition1 = "dead"
            nextPosition2 = ""
            nextPosition3 = ""
            nextPosition4 = ""
        } else {
            ga.GameText.setText("A menacing piranha plant guards the pipe! You skillfully defeat it with your trusty sword.")

            killedPlant = true

            nextPosition1 = "startingPoint"
            nextPosition2 = ""
            nextPosition3 = ""
            nextPosition4 = ""
        }

        showAllButtons()

        ga.choice1.setText(">")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)
    }

    fun swordAltar() {
        if (strength < 1) {
            ga.GameImage.setImageResource(R.drawable.swordaltar)
            ga.GameText.setText("You discover a mystical sword altar, radiating a faint glow. It looks like you need more strength to wield the sword.")

            showAllButtons()

            ga.choice1.setText("Attempt to pull out the sword")
            ga.choice2.setText("Go back")
            ga.choice3.setText("")
            ga.choice4.setText("")
            ga.choice3.setVisibility(View.INVISIBLE)
            ga.choice4.setVisibility(View.INVISIBLE)

            nextPosition1 = "weak"
            nextPosition2 = "startingPoint"
            nextPosition3 = ""
            nextPosition4 = ""
        } else {
            ga.GameImage.setImageResource(R.drawable.swordaltar)
            ga.GameText.setText("You encounter a sword altar, resonating with latent power. You have the strength to attempt to pull out the sword.")

            showAllButtons()

            ga.choice1.setText("Attempt to pull out the sword")
            ga.choice2.setText("Go back")
            ga.choice3.setText("")
            ga.choice4.setText("")
            ga.choice3.setVisibility(View.INVISIBLE)
            ga.choice4.setVisibility(View.INVISIBLE)

            nextPosition1 = "sword"
            nextPosition2 = "startingPoint"
            nextPosition3 = ""
            nextPosition4 = ""
        }
    }

    fun weak() {
        ga.GameImage.setImageResource(R.drawable.weak)
        ga.GameText.setText("You lack the strength to withdraw the sword from the altar. You need to grow stronger to claim it.")

        showAllButtons()

        ga.choice1.setText("Go back")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "startingPoint"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun sword() {
        ga.GameImage.setImageResource(R.drawable.sword)
        ga.GameText.setText("Congratulations! You successfully withdraw the ancient sword from the altar. Its power courses through your veins.")

        sword = true

        showAllButtons()

        ga.choice1.setText("Go back")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "startingPoint"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun lockeChest() {
        ga.GameImage.setImageResource(R.drawable.lockedchest)
        ga.GameText.setText("You approach a locked chest. What would you like to do?")

        showAllButtons()

        ga.choice1.setText("Try to open the chest")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "tryOpen"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun tryOpen() {
        ga.GameImage.setImageResource(R.drawable.openchest)
        ga.GameText.setText("As you open the chest, you find a creature inside!")

        showAllButtons()

        ga.choice1.setText("Look closer")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "mimic"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun mimic() {
        ga.GameImage.setImageResource(R.drawable.mimicchest)
        ga.GameText.setText("You engage in a fierce battle with the mimic!")

        showAllButtons()

        ga.choice1.setText("Attack")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "deadMimic"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun deadMimic() {
        ga.GameImage.setImageResource(R.drawable.swordwound)
        ga.GameText.setText("You attack the mimic and defeat it! Inside the chest, you find the real treasure.")

        showAllButtons()

        ga.choice1.setText(">")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "end"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun end() {
        ga.GameImage.setImageResource(R.drawable.treasure)
        ga.GameText.setText("Congratulations! You have successfully defeated the monster and mimic and claimed the treasure. Your name will forever be remembered in the annals of history.")

        showAllButtons()

        ga.choice1.setText(">")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "showGameCredits"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun dead() {
        ga.GameImage.setImageResource(R.drawable.dead)
        ga.GameText.setText("Your adventure has come to an unfortunate end. But fear not, for there are always new journeys to embark upon.")

        showAllButtons()

        ga.choice1.setText(">")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "showGameCredits"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun showGameCredits() {
        ga.GameText.setText("Game Credits:\n\n- Game Design:\n Lauris Šmeiksts and Daniels Frančenko\n- Programming:\n Lauris Šmeiksts and Daniels Frančenko\n\nThank you for playing!")

        showAllButtons()

        ga.choice1.setText("Back to Title")
        ga.choice2.setText("")
        ga.choice3.setText("")
        ga.choice4.setText("")
        ga.choice2.setVisibility(View.INVISIBLE)
        ga.choice3.setVisibility(View.INVISIBLE)
        ga.choice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "goTitleScreen"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }
}
