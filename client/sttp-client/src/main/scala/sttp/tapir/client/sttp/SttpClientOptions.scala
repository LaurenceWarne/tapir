package sttp.tapir.client.sttp

import sttp.tapir.Defaults
import sttp.tapir.internal.TapirFile

case class SttpClientOptions(createFile: () => TapirFile)

object SttpClientOptions {
  val default: SttpClientOptions = SttpClientOptions(Defaults.createTempFile)
}
