package dev.applearrow.sample

import android.content.Intent
import dev.applearrow.ui.BaseEntryChoiceActivity
import dev.applearrow.ui.Choice

class MainActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return kotlin.collections.listOf(
            Choice(
                "Choice 1",
                "Placeholder for demo 1",
                Intent(this, ChoiceActivity1::class.java)
            ),
            Choice(
                "Choice 2",
                "Placeholder for demo 2",
                Intent(this, ChoiceActivity2::class.java)
            )
        )
    }
}