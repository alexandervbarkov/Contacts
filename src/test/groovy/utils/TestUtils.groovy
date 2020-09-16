package utils

class TestUtils {
    private static final String FIXTURES_PREFIX = 'src/test/resources/fixtures/'

    static String readFixtureAsString(String fixtureName) {
        return FileUtils.readFileAsString("$FIXTURES_PREFIX$fixtureName")
    }
}
