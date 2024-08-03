package com.ganesh.whatsappui.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ganesh.whatsappui.data.INITIAL_SCREEN_INDEX
import com.ganesh.whatsappui.data.tabs
import com.ganesh.whatsappui.ui.components.AppbarComponent
import com.ganesh.whatsappui.ui.components.TabsComponent
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    val pagerState = rememberPagerState(initialPage = INITIAL_SCREEN_INDEX) {
        tabs.size
    }
    val scope = rememberCoroutineScope()

    Column {
        AppbarComponent()
        TabsComponent(pagerState = pagerState,
            initialIndex = INITIAL_SCREEN_INDEX,
            onTabSelected = { selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            })
        HorizontalPager(
            modifier = Modifier.fillMaxSize(), state = pagerState
        ) { page ->
            when (page) {
                0 -> ChatScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}