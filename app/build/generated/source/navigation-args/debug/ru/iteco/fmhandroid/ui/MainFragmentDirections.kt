package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.dto.NewsFilterArgs

public class MainFragmentDirections private constructor() {
  private data class ActionMainFragmentToNewsListFragment(
    public val newsFilterArgs: NewsFilterArgs?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_mainFragment_to_newsListFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(NewsFilterArgs::class.java)) {
        result.putParcelable("newsFilterArgs", this.newsFilterArgs as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(NewsFilterArgs::class.java)) {
        result.putSerializable("newsFilterArgs", this.newsFilterArgs as Serializable?)
      } else {
        throw UnsupportedOperationException(NewsFilterArgs::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionMainFragmentToNewsListFragment(newsFilterArgs: NewsFilterArgs?): NavDirections
        = ActionMainFragmentToNewsListFragment(newsFilterArgs)

    public fun actionMainFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_authFragment)

    public fun actionMainFragmentToAboutFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_aboutFragment)

    public fun actionMainFragmentToOurMissionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_our_mission_fragment)
  }
}
