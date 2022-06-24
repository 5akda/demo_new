package sakda.demonew.main.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

	private val mutableNumber = MutableLiveData<Int>()
	val number: LiveData<Int> = mutableNumber

	fun randomNumber() {
		val num = Random.nextInt(100)
		mutableNumber.postValue(num)
	}
}