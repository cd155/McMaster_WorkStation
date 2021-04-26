JFLAGS = -g
JCLASS = -cp "src:.:junit-4.5.jar"
JC = javac
JVM = java

LATEX_CMD = pdflatex
SRC = final.tex

.PHONY: all
all:
	find . -name '*.class' -exec rm -f {} \;
	# $(JC) $(JCLASS) $(JFLAGS) ./src_blank/TestMinMax.java
	# $(JVM) $(JCLASS) org.junit.runner.JUnitCore src.TestMinMax
	$(JC) $(JCLASS) $(JFLAGS) ./src_blank/TestSeq1D.java
	$(JVM) $(JCLASS) org.junit.runner.JUnitCore src_blank.TestSeq1D

expt:
	$(JC) $(JCLASS) $(JFLAGS) src_blank/Example.java
	$(JVM)  src_blank/Example

latex: 
	$(LATEX_CMD) $(SRC)

clean:	
	@- $(RMDIR) *.ps *.dvi *.aux *.toc *.idx *.ind *.ilg *.log *.out *.brf *.blg *.bbl
