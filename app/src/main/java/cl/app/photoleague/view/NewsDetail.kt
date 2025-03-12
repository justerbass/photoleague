package cl.app.photoleague.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cl.app.photoleague.Model.NewsArticle
import cl.app.photoleague.R
import cl.app.photoleague.components.SocialButton
import cl.app.photoleague.ui.theme.instagramColor
import cl.app.photoleague.ui.theme.twitterColor
import coil.compose.AsyncImage


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsDetail(
    navController: NavController,
    article: NewsArticle
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = article.title) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Volver",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    titleContentColor = MaterialTheme.colorScheme.onBackground
                )
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            AsyncImage(
                model = article.imageUrl,
                contentDescription = article.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                item {
                    Text(
                        text = article.content,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Justify
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
                item{
                    SocialButton(
                        appsocial = "twitter://user?screen_name=photoleagueinfo",
                        websocial = "https://twitter.com/photoleagueinfo",
                        red = "Twitter",
                        icon = R.drawable.icons8_x_384,
                        containercolor = twitterColor
                    )
                }
                item{
                    SocialButton(
                        appsocial = "instagram://user?username=photoleagueinfo",
                        websocial = "https://www.instagram.com/photoleagueinfo",
                        red = "Instagram",
                        icon = R.drawable.icons8_instagram_384,
                        containercolor = instagramColor
                    )
                }
            }
        }
    }
}

