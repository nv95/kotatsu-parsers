package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.ContentType
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("PONYMANGA", "Pony Manga", "en", ContentType.HENTAI)
internal class PonyManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PONYMANGA, "ponymanga.com", 10)
