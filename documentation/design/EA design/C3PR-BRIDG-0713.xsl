<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:UML="omg.org/UML1.3">

<xsl:template match="/">

  <html>
  <body>
    <table border="1">
    <tr bgcolor="#9acd32">
      <th align="left">Class</th>
      <th align="left">Attribute</th>
      <th align="left">Definition</th>
    </tr>
    <xsl:for-each select="//UML:Class">
		<tr>
			<td><xsl:value-of select="@name"/></td>
			<td><xsl:value-of select="count(UML:Classifier.feature/UML:Attribute)"/> attribute(s)</td>
			<td>
				<xsl:choose>
					<xsl:when test="count(UML:ModelElement.taggedValue/UML:TaggedValue[@tag='documentation'])>0">
						<xsl:value-of select="UML:ModelElement.taggedValue/UML:TaggedValue[@tag='documentation']/@value"/>
					</xsl:when>
					<xsl:otherwise>
						no definition
					</xsl:otherwise>
				</xsl:choose>
			</td>
		</tr>
			<xsl:for-each select="UML:Classifier.feature/UML:Attribute">
				<tr>
					<td><xsl:value-of select="../../@name"/></td>
					<td><xsl:value-of select="@name"/></td>
					<td>
						<xsl:choose>
							<xsl:when test="count(UML:ModelElement.taggedValue/UML:TaggedValue[@tag='description'])>0">
								<xsl:value-of select="UML:ModelElement.taggedValue/UML:TaggedValue[@tag='description']/@value"/>
							</xsl:when>
							<xsl:otherwise>
								no definition
							</xsl:otherwise>
						</xsl:choose>
					</td>
				</tr>
			</xsl:for-each>
	</xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>
