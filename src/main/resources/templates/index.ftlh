<!doctype html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <title>Multiplication Circle</title>
    <link rel="stylesheet" href="stylesheet.css">
</head>

<body>

<main>
    <form action="" method="get">
        <label for="segment-count">Segment Count: </label>
        <input id="segment-count" name="segmentCount" type="number" value="${segmentCount}" min="3" max="1000"
               required/>
        <label for="multiplier">Multiplier: </label>
        <input id="multiplier" name="multiplier" type="number" value="${multiplier}" min="2" max="200" required/>
        <button type="submit">Send</button>
    </form>

    <svg width="${2 * radius}"
         height="${2 * radius}"
         viewBox="${-radius - 5} ${-radius - 5} ${2 * radius + 10} ${2 * radius + 10}">
        <circle r="${radius}"/>

        <!-- TODO: Add code to draw the lines here -->
        <#list lines as line>
            <line
                    x1="${line.x1}"
                    y1="${line.y1}"
                    x2="${line.x2}"
                    y2="${line.y2}"/>
        </#list>

    </svg>
</main>

</body>
</html>
