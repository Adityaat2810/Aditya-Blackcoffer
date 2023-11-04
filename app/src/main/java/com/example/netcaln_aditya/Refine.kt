package com.example.netcaln_aditya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.netcaln_aditya.databinding.ActivityMainBinding
import com.example.netcaln_aditya.databinding.ActivityRefineBinding

class Refine : AppCompatActivity() {
    private var isButtonClicked = false

    private lateinit var binding: ActivityRefineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_refine)

        val selectButton: ImageView = findViewById(R.id.selectButton)
        val textView: TextView = findViewById(R.id.textView)

        selectButton.setOnClickListener {
            showRoleOptionsDialog { selectedRole ->
                textView.text = selectedRole
            }
        }


        binding.b1.setOnClickListener {
            cahngeColor(binding.b1)
        }
        binding.b2.setOnClickListener {
            cahngeColor(binding.b2)
        }
        binding.b3.setOnClickListener {
            cahngeColor(binding.b3)
        }
        binding.b4.setOnClickListener {
            cahngeColor(binding.b4)
        }
        binding.b5.setOnClickListener {
            cahngeColor(binding.b5)
        }
        binding.b6.setOnClickListener {
            cahngeColor(binding.b6)
        }
         binding.b7.setOnClickListener {
            cahngeColor(binding.b7)
        }
         binding.b8.setOnClickListener {
            cahngeColor(binding.b8)
        }









    }



    private fun showRoleOptionsDialog(onRoleSelected: (String) -> Unit) {
        val options = arrayOf("Available | Hey let us connect ",
            "Away ! Stay Discrete and watch ",
            "Busy| Do not Disturb | Catch up later ",
            "SOS | Emergency! Need Assistance! HELP", )

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Select Role")
            .setItems(options) { _, which ->
                onRoleSelected(options[which])
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
        builder.show()
    }

    fun cahngeColor(button:Button) {
        isButtonClicked = !isButtonClicked

        if (isButtonClicked) {
            button.setBackgroundColor(resources.getColor(R.color.teal_700))
        } else {

            button.setBackgroundColor(resources.getColor(R.color.ThemeColor))
        }


    }


}
