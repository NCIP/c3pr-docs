<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:UML="omg.org/UML1.3">

<xsl:template match="/">

  <html>
  <body>
    <table border="1">
    <tr bgcolor="#9acd32">
      <th align="left">Class</th>
      <th align="left">Attribute</th>
    </tr>
    <xsl:for-each select="//UML:Class">
		<xsl:choose>
			<xsl:when test="count(UML:Classifier.feature/UML:Attribute)>0">
				<xsl:for-each select="UML:Classifier.feature/UML:Attribute">
					<tr>
					  <td><xsl:value-of select="../../@name"/></td>
					  <td><xsl:value-of select="@name"/></td>
					</tr>
				</xsl:for-each>
			</xsl:when>
			<xsl:otherwise>
					<tr>
					  <td><xsl:value-of select="@name"/></td>
					  <td>NO ATTRIBUTES</td>
					</tr>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>
