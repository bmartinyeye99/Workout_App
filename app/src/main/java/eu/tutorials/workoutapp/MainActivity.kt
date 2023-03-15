package eu.tutorials.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import eu.tutorials.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      /*  binding object will store the activity main xml,
         the root of binding will be the root of the xml file, the top header
         this way we also can access the ids of this xml's elements
         its shorter, concise, faster, safer- because ensures
         that only the views in the  connecting layout are being referenced, so we cannot
          refernce to wrong elements which have the same ids, so we access only the ids of this class,
           unlike findViewById */

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener {
          val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}
