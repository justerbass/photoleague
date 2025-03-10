package cl.app.photoleague.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cl.app.photoleague.R
import cl.app.photoleague.components.CategorySelector
import cl.app.photoleague.components.NewsCard
import cl.app.photoleague.components.SocialButton
import cl.app.photoleague.navigation.BottomNavigationBar
import cl.app.photoleague.ui.theme.instagramColor
import cl.app.photoleague.ui.theme.twitterColor
import cl.app.photoleague.viewModel.TeamsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun News(navController: NavController, viewModel: TeamsViewModel) {
    val selectedCategory by viewModel.selectedCategory.collectAsState()

    val newsArticle by viewModel.newsArticles.collectAsState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.photo1),
                            contentDescription = "Logo",
                            modifier = Modifier.size(48.dp)
                        )
                        Text(text = "Noticias $selectedCategory")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary

                )
            )
        },
        bottomBar = { BottomNavigationBar(navController) })

    { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {

            SocialButton(
                appsocial = "twitter://user?screen_name=photoleagueinfo",
                websocial = "https://twitter.com/photoleagueinfo",
                red = "Twitter",
                icon = R.drawable.icons8_x_384,
                containercolor = twitterColor
            )
            CategorySelector(selectedCategory, viewModel::selectCategory)
            SocialButton(
                appsocial = "instagram://user?username=photoleagueinfo",
                websocial = "https://www.instagram.com/photoleagueinfo",
                red = "Instagram",
                icon = R.drawable.icons8_instagram_384,
                containercolor = instagramColor
            )

            Text(
                text = "Últimas Noticias",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            if (newsArticle.isEmpty()) {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp)
                ) {
                    items(newsArticle) { article->
                        NewsCard(article = article)
                    }
                }
            }
        }

    }
}


