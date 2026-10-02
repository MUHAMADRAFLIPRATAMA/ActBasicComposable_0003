package com.example.praktikumke2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikumke2.ui.theme.PraktikumKe2Theme

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    // Ganti nama drawable di bawah sesuai nama file gambar di res/drawable
    val latar = painterResource(id = R.drawable.prabowo)
    val logo = painterResource(id = R.drawable.jmk48)
    val foto = painterResource(id = R.drawable.gib)
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = latar,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(48.dp))

            // Logo
            Image(
                painter = logo,
                contentDescription = "Logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(140.dp)
            )