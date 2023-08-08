run:
	bb multi_dup.clj --amount ${AMOUNT}

clean:
	rm -rf workdir/*
