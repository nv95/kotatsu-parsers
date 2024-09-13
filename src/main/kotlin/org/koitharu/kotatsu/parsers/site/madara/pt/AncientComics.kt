package org.koitharu.kotatsu.parsers.site.madara.pt

import org.koitharu.kotatsu.parsers.Broken
import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.model.SortOrder
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser
import java.util.EnumSet

@Broken
@MangaSourceParser("ANCIENTCOMICS", "AncientComics", "pt")
internal class AncientComics(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ANCIENTCOMICS, "ancientcomics.com.br") {
	override val datePattern: String = "dd/MM/yyyy"
	override val withoutAjax = true
	override val isTagsExclusionSupported = false
	override val availableSortOrders: Set<SortOrder> =
		EnumSet.of(SortOrder.UPDATED, SortOrder.POPULARITY, SortOrder.NEWEST, SortOrder.ALPHABETICAL, SortOrder.RATING)
}
