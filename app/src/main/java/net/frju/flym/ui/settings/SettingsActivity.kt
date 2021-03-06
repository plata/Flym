/*
 * Copyright (c) 2012-2018 Frederic Julian
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http:></http:>//www.gnu.org/licenses/>.
 */

package net.frju.flym.ui.settings

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import net.fred.feedex.R
import net.frju.flym.data.utils.PrefConstants
import net.frju.flym.utils.getPrefString

class SettingsActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		//Choose theme
		setTheme(when (getPrefString(PrefConstants.THEME, "DARK")) {
			"LIGHT" -> R.style.AppThemeLight
			"DARK" -> R.style.AppTheme
			"BLACK" -> R.style.AppThemeBlack
			else -> R.style.AppTheme
		})

		super.onCreate(savedInstanceState)


		setContentView(R.layout.activity_settings)

		supportActionBar?.setDisplayHomeAsUpEnabled(true)
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		when (item.itemId) {
			android.R.id.home -> {
				finish()
			}
		}
		return true
	}
}