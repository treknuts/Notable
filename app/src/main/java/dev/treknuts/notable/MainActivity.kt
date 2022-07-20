package dev.treknuts.notable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val notes = mutableListOf<Note>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add_button = findViewById<FloatingActionButton>(R.id.add_note_button)
        add_button.setOnClickListener {
            notes.add(Note("Work out", "I need to go to the gym and be not fat"))
            val toast = Toast.makeText(applicationContext, "Note added!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}