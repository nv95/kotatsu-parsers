package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HARIMANGA", "Hari Manga", "en")
internal class HariManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.HARIMANGA, "harimanga.com", pageSize = 10)
