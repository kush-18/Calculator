package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var lastNumeric = false
    var stateError = false
    var lastDot = false
    private lateinit var expression: Expression
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn0.setOnClickListener {
            binding.inputtext.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.btnDot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.btnDivide.setOnClickListener {
            binding.inputtext.append("/")
        }
        binding.btnMultiply.setOnClickListener {
            binding.inputtext.append("*")
        }
        binding.btnAdd.setOnClickListener {
            binding.inputtext.append(" + ")
        }
        binding.btnSubtract.setOnClickListener {
            binding.inputtext.append(" - ")
        }
        binding.btnModulo.setOnClickListener {
            binding.inputtext.append("%")
        }
        binding.btnAllclear.setOnClickListener {
            binding.inputtext.text = " "
            binding.outputtxt.text = " "
        }
        binding.btnClear.setOnClickListener {
            binding.inputtext.text = " "
        }
        binding.btn2.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()
            if( result == longresult.toDouble() )
            {
                binding.outputtxt.text = longresult.toString()

            }
            else
            {
                binding.outputtxt.text = result.toString()
            }
        }
    }

    fun onAllClearClick(view: View) {}
    fun onDigitClick(view: View) {}
    fun onEqualClick(view: View) {}
    fun onOperatorClick(view: View) {}
    fun onClearClick(view: View) {}
    fun onBackClick(view: View) {}
}