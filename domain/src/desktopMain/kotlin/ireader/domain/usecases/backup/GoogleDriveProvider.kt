package ireader.domain.usecases.backup

/**
 * Desktop implementation uses stub (Google Drive not typically used on desktop)
 */
actual fun createGoogleDriveProvider(): CloudStorageProvider = GoogleDriveProviderStub()
