package sakda.demonew.main.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import sakda.demonew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	private lateinit var binding: ActivityMainBinding

	private val viewModel: MainViewModel by lazy {
		ViewModelProvider(this)[MainViewModel::class.java]
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		binding.button.setOnClickListener {
			viewModel.randomNumber()
		}

		viewModel.number.observe(this) {
			binding.textView.text = it.toString()
		}
	}
}