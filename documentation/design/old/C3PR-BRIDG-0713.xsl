<?xml version="1.0" encoding="UTF-8"?>
<!-- <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:UML="omg.org/UML1.3"> -->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/02/xpath-functions" xmlns:xdt="http://www.w3.org/2005/02/xpath-datatypes" xmlns:UML="omg.org/UML1.3" xmlns:foo="http://whatever">


  <xsl:function name="foo:fetchDocumentation">
    <xsl:param name="id"/>
    <xsl:param name="uml"/>
    <xsl:value-of select="$uml[@modelElement=$id]/@value"/>
  </xsl:function>

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
						<xsl:value-of select="foo:fetchDocumentation(@xmi.id, /XMI/XMI.content/UML:TaggedValue[@tag='documentation'])"/>
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
