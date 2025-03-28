class StanzaRunner {
    public static void main(String[] args) {

        int lineCount = 4;
        String theme = "Nature";
        String language = "English";
        String poeticStyle = "Haiku";
        String writer = "William Wordsworth";
        boolean hasRhyme = false;
        String content = "I wandered lonely as a cloud\nThat floats on high o'er vales and hills,\nWhen all at once I saw a crowd,\nA host, of golden daffodils.";
        String tone = "Calm";
        String rhythmPattern = "5-7-5";
        boolean isNarrative = false;

        Stanza stanza1 = new Stanza();
        stanza1.info();
        System.out.println();

        Stanza stanza2 = new Stanza(lineCount);
        stanza2.info();
        System.out.println();

        Stanza stanza3 = new Stanza(lineCount, theme);
        stanza3.info();
        System.out.println();

        Stanza stanza4 = new Stanza(lineCount, theme, language);
        stanza4.info();
        System.out.println();

        Stanza stanza5 = new Stanza(lineCount, theme, language, poeticStyle);
        stanza5.info();
        System.out.println();

        Stanza stanza6 = new Stanza(lineCount, theme, language, poeticStyle, writer);
        stanza6.info();
        System.out.println();

        Stanza stanza7 = new Stanza(lineCount, theme, language, poeticStyle, writer, hasRhyme);
        stanza7.info();
        System.out.println();

        Stanza stanza8 = new Stanza(lineCount, theme, language, poeticStyle, writer, hasRhyme, content);
        stanza8.info();
        System.out.println();

        Stanza stanza9 = new Stanza(lineCount, theme, language, poeticStyle, writer, hasRhyme, content, tone);
        stanza9.info();
        System.out.println();

        Stanza stanza10 = new Stanza(lineCount, theme, language, poeticStyle, writer, hasRhyme, content, tone, rhythmPattern);
        stanza10.info();
        System.out.println();

        Stanza stanza11 = new Stanza(lineCount, theme, language, poeticStyle, writer, hasRhyme, content, tone, rhythmPattern, isNarrative);
        stanza11.info();
    }
}
