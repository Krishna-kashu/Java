class Stanza {
    int lineCount;
    String theme;
    String language;
    String poeticStyle;
    String writer;
    boolean hasRhyme;
    String content;
    String tone;
    String rhythmPattern;
    boolean isNarrative;

    public Stanza() {
        System.out.println("Stanza Details:");
    }

    public Stanza(int lineCount) {
        this();
        this.lineCount = lineCount;
    }

    public Stanza(int lineCount, String theme) {
        this(lineCount);
        this.theme = theme;
    }

    public Stanza(int lineCount, String theme, String language) {
        this(lineCount, theme);
        this.language = language;
    }

    public Stanza(int lineCount, String theme, String language, String poeticStyle) {
        this(lineCount, theme, language);
        this.poeticStyle = poeticStyle;
    }

    public Stanza(int lineCount, String theme, String language, String poeticStyle, String writer) {
        this(lineCount, theme, language, poeticStyle);
        this.writer = writer;
    }

    public Stanza(int lineCount, String theme, String language, String poeticStyle, String writer, boolean hasRhyme) {
        this(lineCount, theme, language, poeticStyle, writer);
        this.hasRhyme = hasRhyme;
    }

    public Stanza(int lineCount, String theme, String language, String poeticStyle, String writer, boolean hasRhyme, String content) {
        this(lineCount, theme, language, poeticStyle, writer, hasRhyme);
        this.content = content;
    }

    public Stanza(int lineCount, String theme, String language, String poeticStyle, String writer, boolean hasRhyme, String content, String tone) {
        this(lineCount, theme, language, poeticStyle, writer, hasRhyme, content);
        this.tone = tone;
    }

    public Stanza(int lineCount, String theme, String language, String poeticStyle, String writer, boolean hasRhyme, String content, String tone, String rhythmPattern) {
        this(lineCount, theme, language, poeticStyle, writer, hasRhyme, content, tone);
        this.rhythmPattern = rhythmPattern;
    }

    public Stanza(int lineCount, String theme, String language, String poeticStyle, String writer, boolean hasRhyme, String content, String tone, String rhythmPattern, boolean isNarrative) {
        this(lineCount, theme, language, poeticStyle, writer, hasRhyme, content, tone, rhythmPattern);
        this.isNarrative = isNarrative;
    }

    public void info() {
        System.out.println("Line Count: " + this.lineCount);
        System.out.println("Theme: " + this.theme);
        System.out.println("Language: " + this.language);
        System.out.println("Poetic Style: " + this.poeticStyle);
        System.out.println("Writer: " + this.writer);
        System.out.println("Has Rhyme: " + this.hasRhyme);
        System.out.println("Content: " + this.content);
        System.out.println("Tone: " + this.tone);
        System.out.println("Rhythm Pattern: " + this.rhythmPattern);
        System.out.println("Is Narrative: " + this.isNarrative);
    }

    
}
