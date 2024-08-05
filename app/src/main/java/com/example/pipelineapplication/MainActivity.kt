package com.example.pipelineapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pipelineapplication.ui.theme.PipeLineApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PipeLineApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreenPreview()
                }
            }
        }
    }
}


@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        Spacer(modifier = Modifier.height(35.dp))

        Text(
            text = stringResource(id = R.string.sign_in),
            style = MaterialTheme.typography.headlineLarge.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif
            ),
            modifier = Modifier.padding(start = 24.dp)
        )

        Text(
            text = stringResource(id = R.string.sign_in_to_continue),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 16.sp,
                fontFamily = FontFamily.Serif
            ),
            modifier = Modifier.padding(start = 24.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.email)) },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.email_icon),
                    contentDescription = null,
                    tint = Color.Gray
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 41.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.password)) },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.password_key_icon),
                    contentDescription = null,
                    tint = Color.Gray
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 41.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.forgot_your_password),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Blue
            ),
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 24.dp)
                .clickable { /* Handle click */ }
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = stringResource(id = R.string.sign_in_with),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 11.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Gray
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.fingerprint_bg),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(Color.White, RoundedCornerShape(20))
                .padding(6.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
               // Toast.makeText(this, "This button is clickable", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 41.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = stringResource(id = R.string.sign_in),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_fleet_logo),
            contentDescription = null,
            modifier = Modifier
                .height(35.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    PipeLineApplicationTheme {
        LoginScreen()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PipeLineApplicationTheme {
        Greeting("Android")
    }
}