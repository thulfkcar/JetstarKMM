package com.raghav.jetstar.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopActionBar(
    modifier: Modifier = Modifier,
    title: String,
    showSearchIcon: Boolean = true,
    navigationIcon: @Composable (() -> Unit) = {},
    onNavigationButtonClicked: () -> Unit = {},
    onTitleIconClicked: () -> Unit = {},
    onSearchIconClicked: () -> Unit = {}

) {
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = 8.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                IconButton(onClick = { onNavigationButtonClicked() }) {
                    navigationIcon()
                }
                IconButton(onClick = { onTitleIconClicked() }) {
                    Text(text = title)
                }
            }
            if (showSearchIcon) {
                IconButton(onClick = { onSearchIconClicked() }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                }
            }
        }
    }
}
