
const buildNumberPattern = (cantEnteros: number, cantDecimales: number) => `^((?!0)\\d{1,${cantEnteros}}|0|\\.\\d{1,${cantDecimales}})($|\\.$|\\.\\d{1,${cantDecimales}}$)`;


export const FormUtil = {
  buildNumberPattern
};
